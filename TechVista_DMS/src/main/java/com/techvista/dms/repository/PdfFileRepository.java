package com.techvista.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techvista.dms.model.PdfFile;

@Repository
public interface PdfFileRepository extends JpaRepository<PdfFile, String> {
	
	

	}