package java;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class Controller {
    private final ProductService productService;

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return productService.findProductDtoById(id);
    }
}
