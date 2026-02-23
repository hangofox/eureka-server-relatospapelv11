//DECLARACION DE PAQUETES:
package com.relatospapelv11.eurekaserver;

//IMPORTACION DE LIBRERIAS:
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//DECLARACION DE LA CLASE PRINCIPAL:
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerRelatosPapelv11Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerRelatosPapelv11Application.class, args);
	}
}
