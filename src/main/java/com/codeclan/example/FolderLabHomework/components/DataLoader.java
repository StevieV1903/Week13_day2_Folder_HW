package com.codeclan.example.FolderLabHomework.components;

import com.codeclan.example.FolderLabHomework.models.FileType;
import com.codeclan.example.FolderLabHomework.models.Folder;
import com.codeclan.example.FolderLabHomework.models.Worker;
import com.codeclan.example.FolderLabHomework.repositories.FileRepository;
import com.codeclan.example.FolderLabHomework.repositories.FolderRepository;
import com.codeclan.example.FolderLabHomework.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

    @Component
    public class DataLoader implements ApplicationRunner {

        @Autowired
        FolderRepository folderRepository;

        @Autowired
        FileRepository fileRepository;

        @Autowired
        WorkerRepository workerRepository;

        public DataLoader() {
        }

        public void run(ApplicationArguments args) {
            Worker james = new Worker("James");
            workerRepository.save(james);

            Folder music = new Folder("Music", james);
            folderRepository.save(music);

            Folder photos = new Folder("Photos", james);
            folderRepository.save(photos);

            Folder videos = new Folder("Videos", james);
            folderRepository.save(videos);

            FileType rockAlbum = new FileType("Rock", "MP3", 256, music);
            fileRepository.save(rockAlbum);

            FileType holidayPhoto = new FileType("Holiday", "JPG", 187, photos);
            fileRepository.save(holidayPhoto);

            FileType timeLapse = new FileType("Cartwheel", "GIF", 55, videos);
            fileRepository.save(timeLapse);

            james.addFolder(music);
            james.addFolder(photos);
            workerRepository.save(james);

            videos.addFileType(timeLapse);
            folderRepository.save(videos);
        }



}

