package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest;

import es.rbailen.sample.hexagonalarchitecture.application.ports.input.GetItemMedicionElementoUseCase;
import es.rbailen.sample.hexagonalarchitecture.domain.model.ItemMedicionElemento;
import es.rbailen.sample.hexagonalarchitecture.application.ports.input.CreateItemMedicionElementoUseCase;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.request.ItemMedicionElementoCreateRequest;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ItemMedicionElementoCreateResponse;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ItemMedicionElementoQueryResponse;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.mapper.ItemMedicionElementoRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/proceso")
@RequiredArgsConstructor
public class ItemMedicionElementoRestAdapter {

    private final CreateItemMedicionElementoUseCase createProductUseCase;

    private final GetItemMedicionElementoUseCase getProductUseCase;

    private final ItemMedicionElementoRestMapper productRestMapper;

    @PostMapping(value = "/mediciones")
    public ResponseEntity<ItemMedicionElementoCreateResponse> createProduct(@RequestBody @Valid ItemMedicionElementoCreateRequest productCreateRequest){
        // Request to domain
        ItemMedicionElemento product = productRestMapper.toItemMedicionElemento(productCreateRequest);

        product = createProductUseCase.createItemMedicionElemento(product);

        // Domain to response
        return new ResponseEntity<>(productRestMapper.toItemMedicionElementoCreateResponse(product), HttpStatus.CREATED);
    }

    @GetMapping(value = "/mediciones/{id}")
    public ResponseEntity<ItemMedicionElementoQueryResponse> getProduct(@PathVariable Long id){
        ItemMedicionElemento product = getProductUseCase.getItemMedicionElementoById(id);
        return new ResponseEntity<>(productRestMapper.toItemMedicionElementoQueryResponse(product), HttpStatus.OK);
    }

}
