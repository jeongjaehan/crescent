package com.tistory.devyongsik.domain;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.junit.Test;

import com.tistory.devyongsik.config.CrescentCollectionHandler;
import com.tistory.devyongsik.config.SpringApplicationContext;
import com.tistory.devyongsik.utils.CrescentTestCaseUtil;

public class CrescentCollectionTest extends CrescentTestCaseUtil {

	@PostConstruct
	public void init() {
		super.init();
	}

	@Test
	public void collectionTest() {
		CrescentCollectionHandler collectionHandler 
		= SpringApplicationContext.getBean("crescentCollectionHandler", CrescentCollectionHandler.class);
		
		CrescentCollections crescentCollections = collectionHandler.getCrescentCollections();

		Map<String, CrescentCollection> collections = crescentCollections.getCrescentCollectionsMap();

		CrescentCollection sampleCollection = collections.get("sample");
		
		Assert.assertNotNull(sampleCollection);
		
		
	}
}
