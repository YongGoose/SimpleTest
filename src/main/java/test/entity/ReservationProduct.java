package test.entity;

import java.util.Set;

import lombok.Data;

/**
 *
 * @author yongjunhong
 * @since 2024. 7. 24.
 */
@Data
public class ReservationProduct {
	private Integer id;
	private String name;
	private Integer price;
	private Set<String> reservationTags;

	@Override
	public String toString() {
		return "ReservationProduct{" +
			"id=" + id +
			", name='" + name + '\'' +
			", price=" + price +
			", reservationTags=" + reservationTags +
			'}';
	}
}
