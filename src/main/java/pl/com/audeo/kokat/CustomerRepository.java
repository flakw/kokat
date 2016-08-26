package pl.com.audeo.kokat;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: Wojtek
 * Date: 2016-08-26
 * Time: 20:20
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
