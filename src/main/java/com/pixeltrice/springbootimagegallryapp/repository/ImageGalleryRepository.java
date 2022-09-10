package com.pixeltrice.springbootimagegallryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixeltrice.springbootimagegallryapp.entity.ImageGallery;




@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}