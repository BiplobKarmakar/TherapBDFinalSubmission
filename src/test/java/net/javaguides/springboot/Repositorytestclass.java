package net.javaguides.springboot;




import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

//@RunWith(SpringRunner.class)
@DataJpaTest
public class Repositorytestclass {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repo;

    @Test
    public void testFindByStatus() {
    	User user=new User();
      //  Offers Offer = new Offers();
        entityManager.persist(user);

        List<User> findByStatus = repo.findAll();
        		//user.f.findByStatus(Offer.getStatus());
        System.out.println(findByStatus);

       // assertThat(findByStatus).extracting(User::getEmail).containsOnly(User::getEmail);
    }
}

