package com.techvista.dms.service;


	import java.io.IOException;
	import java.util.stream.Stream;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.util.StringUtils;
	import org.springframework.web.multipart.MultipartFile;

import com.techvista.dms.model.PdfFile;
import com.techvista.dms.repository.PdfFileRepository;
	
	@Service
	public class PdfFileStorageService {

	  @Autowired
	  private PdfFileRepository PdfFileRepository;

	  public PdfFile store(MultipartFile file) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    PdfFile PdfFile = new PdfFile(fileName, file.getContentType(), file.getBytes());

	    return PdfFileRepository.save(PdfFile);
	  }

	  public PdfFile getFile(String id) {
	    return PdfFileRepository.findById(id).get();
	  }
	  
	  public Stream<PdfFile> getAllFiles() {
	    return PdfFileRepository.findAll().stream();
	  }
	}