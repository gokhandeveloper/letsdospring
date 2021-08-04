package com.gokhandilek.letsdospring;

import com.gokhandilek.letsdospring.data.entity.Room;
import com.gokhandilek.letsdospring.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LetsdospringApplication {

    public static void main(String[] args) {

        SpringApplication.run(LetsdospringApplication.class, args);
    }

    @RestController
    public class  RoomController {
        @Autowired

        private RoomRepository roomRepository;

        @GetMapping
        public Iterable<Room> getRooms() {
            return this.roomRepository.findAll();
        }

    }

}
