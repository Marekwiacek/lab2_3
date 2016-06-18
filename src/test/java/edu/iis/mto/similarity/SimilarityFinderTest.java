package edu.iis.mto.similarity;

import javax.naming.directory.SearchResult;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.search.SequenceSearcher;

public class SimilarityFinderTest {
	
	int[] seq1;
	int[] seq2;
	double value;
	
	SimilarityFinder finder;
	SequenceSearcher searcher;
	
	
	@Before
	public void init(){
		finder = new SimilarityFinder(searcher);
	}
	
	@Test
	public void calculateSimilarityNullTest(){
		seq1= new int[]{};
		seq2= new int[]{};
		
		value = finder.calculateJackardSimilarity(seq1, seq2);
		assertThat(value, equalTo(1.0d));
	}

	@Test
	public void calculateSimilarityFirstNullTest(){
		seq1= new int[]{};
		seq2= new int[]{1,2};
		
		value = finder.calculateJackardSimilarity(seq1, seq2);
		assertThat(value, equalTo((double)0/(double)2));
	}

	@Test
	public void calculateSimilarityNotNullTest(){
		seq1= new int[]{1,2};
		seq2= new int[]{1,2,3};
		
		value = finder.calculateJackardSimilarity(seq1, seq2);
		assertThat(value, equalTo((double)2/(double)3));
	}

}
