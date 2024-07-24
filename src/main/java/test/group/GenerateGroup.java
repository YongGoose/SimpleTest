package test.group;

import java.util.Set;

import net.jqwik.api.Arbitraries;

import test.entity.Product;
import test.entity.ReservationProduct;

import com.navercorp.fixturemonkey.ArbitraryBuilder;
import com.navercorp.fixturemonkey.FixtureMonkey;

/**
 *
 * @author yongjunhong
 * @since 2024. 7. 24.
 */
public class GenerateGroup {
	public ArbitraryBuilder<Product> generateProductMonkey(FixtureMonkey fixtureMonkey) {
		return fixtureMonkey.giveMeBuilder(Product.class)
			.set("id", Arbitraries.integers().greaterOrEqual(0))
			.set("name", Arbitraries.strings().alpha())
			.set("price", Arbitraries.integers().between(1000, 10000))
			.setNotNull("tags");
	}

	public ArbitraryBuilder<ReservationProduct> generateReservationProductMonkey(FixtureMonkey fixtureMonkey) {
		return fixtureMonkey.giveMeBuilder(ReservationProduct.class)
			.set("id", Arbitraries.integers().greaterOrEqual(0))
			.set("name", Arbitraries.strings().numeric())
			.set("price", Arbitraries.integers().between(1000, 10000))
			.set("reservationTags", Arbitraries.subsetOf("123","234","345","456","567","678","789"));
	}
}
