package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import test.entity.Product;
import test.entity.ReservationProduct;
import test.group.GenerateGroup;

import com.navercorp.fixturemonkey.FixtureMonkey;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		FixtureMonkey fixtureMonkey = FixtureMonkey.builder()
			.registerGroup(GenerateGroup.class)
			.build();

		Product product = fixtureMonkey.giveMeOne(Product.class);
		ReservationProduct reservationProduct = fixtureMonkey.giveMeOne(ReservationProduct.class);

		System.out.println(product);
		System.out.println(reservationProduct);
	}

}
