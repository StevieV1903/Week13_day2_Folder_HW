package com.codeclan.example.FolderLabHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @JsonIgnoreProperties("folders")
    @ManyToOne
    @JoinColumn(name = "workers_id", nullable = false)
    private Worker worker;

    @JsonIgnoreProperties("folder")
    @OneToMany(mappedBy = "folder")
    private List<FileType> fileTypes;

    public Folder(String title, Worker worker) {
        this.title = title;
        this.worker = worker;
        this.fileTypes = new ArrayList<>();
    }

    public Folder(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Worker getUser() {
        return worker;
    }

    public void setUser(Worker worker) {
        this.worker = worker;
    }

    public List<FileType> getFiles() {
        return fileTypes;
    }

    public void setFiles(List<FileType> fileTypes) {
        this.fileTypes = fileTypes;
    }

    public void addFileType(FileType fileType){
        this.fileTypes.add(fileType);
    }
}
