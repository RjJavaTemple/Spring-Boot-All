package in.Ranjan;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import in.Ranjan.Controller.VisiterController;
import in.Ranjan.Modle.Visiter;

@SpringBootApplication
public class Application {

	@Bean("createC3pods")
	@Profile("uat")
	public ComboPooledDataSource CreateC3pods() throws Exception {
		System.out.println("Application.CreateC3pods()");
		ComboPooledDataSource cds = new ComboPooledDataSource();
		cds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		cds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:chintu");
		cds.setUser("system");
		cds.setPassword("123");
		return cds;
	}

	public static void main(String[] args) {
		// Create The Ioc Container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		// Create The Bean
		VisiterController cont = ctx.getBean("visiterController", VisiterController.class);
		// Use The Scanner Class And Add The Value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Dist-1");
		String dist1 = sc.next();
		System.out.println("Enter The Dist-2");
		String dist2 = sc.next();
		System.out.println("Enter The Dist-3");
		String dist3 = sc.next();

		// Add The Business Logic
		try {
			List<Visiter> visit = cont.ShowVisitPlaceByDistic(dist1, dist2, dist3);
			System.out.println("Details Are...........!!");
			visit.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("The Result Are Not Found.......!");
		}
	}

}
