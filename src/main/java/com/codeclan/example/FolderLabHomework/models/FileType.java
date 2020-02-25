package com.codeclan.example.FolderLabHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "fileTypes")
public class FileType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_extension")
    private String fileExtension;

    @Column(name = "file_size")
    private int fileSize;

    @JsonIgnoreProperties("fileTypes")
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public FileType(String name, String fileExtension, int size, Folder folder) {
        this.fileName = name;
        this.fileExtension = fileExtension;
        this.fileSize = size;
        this.folder = folder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return fileName;
    }

    public void setName(String name) {
        this.fileName = name;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public int getSize() {
        return fileSize;
    }

    public void setSize(int size) {
        this.fileSize = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
