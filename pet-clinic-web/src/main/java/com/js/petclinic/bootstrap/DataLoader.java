package com.js.petclinic.bootstrap;

import com.js.petclinic.model.Owner;
import com.js.petclinic.model.Vet;
import com.js.petclinic.services.OwnerService;
import com.js.petclinic.services.VetService;
import com.js.petclinic.services.map.OwnerMapService;
import com.js.petclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setName("Jovan");
        owner1.setSurname("Stepanovic");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setName("Mia");
        owner2.setSurname("Gasic");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setName("Misko");
        vet1.setSurname("Simovic");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setName("Marko");
        vet2.setSurname("Prelac");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
