package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/welcome")
    @ApiOperation(value = "Responsável por retornar uma mensagem de boas vindas.")
    public String mensagemBoasVindas() {
        return "BEM VINDO À PRODUCT REST API.";
    }

    @GetMapping("/allProducts")
    @ApiResponses(value = {
            @ApiResponse(code = 11, message = "Warning - the process returned more than 1000 products.")
    })
    @ApiOperation(value = "Responsável por retornar uma lista de produtos.")
    public List<Product> allProducts() {
        return productRepository.getAllProducts();
    }

    @GetMapping("/findProductById/{id}")
    @ApiResponses(value = {
            @ApiResponse(code = 12, message = "The field id not informed. This information is required.")
    })
    @ApiOperation(value = "Responsável por retornar um produto pelo id.")
    public Product findProductById(Integer id) {
        return productRepository.getProductById(id);
    }

    @PostMapping("/addProduct")
    @ApiResponses(value = {
            @ApiResponse(code = 10, message = "Required fields not informed.")
    })
    @ApiOperation(value = "Responsável por adicionar um produto.")
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @PutMapping("/updateProduct")
    @ApiResponses(value = {
            @ApiResponse(code = 14, message = "No information has been updated. The new information is the same as recorded in the database.")
    })
    @ApiOperation(value = "Responsável por atualizar um produto.")
    public void updateProduct(Product product) {
        productRepository.updateProduct(product);
    }

    @DeleteMapping("/removeProduct")
    @ApiResponses(value = {
            @ApiResponse(code = 13, message = "User not allowed to remove a product from this category.")
    })
    @ApiOperation(value = "Responsável por remover um produto.")
    public void removeProduct(Integer id) {
        productRepository.removeProduct(findProductById(id));
    }
}
