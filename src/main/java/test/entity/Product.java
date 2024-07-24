package test.entity;

import java.util.Set;

import lombok.Data;

/**
 *
 * @author yongjunhong
 * @since 2024. 7. 24.
 */
@Data
public class Product {
	private Integer id;
	private String name;
	private Integer price;
	private Set<String> tags;

	@Override
	public String toString() {
		return "Product{" +
			"id=" + id +
			", name='" + name + '\'' +
			", price=" + price +
			", tags=" + tags +
			'}';
	}
}
