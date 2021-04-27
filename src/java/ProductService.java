package java;

public class ProductService {
    private final ProductRepository productRepository;
    public Optional<ProductDto> findProductDtoById(Long id) {
        return productRepository.findById(id).map(ProductDto::new);
    }
}
