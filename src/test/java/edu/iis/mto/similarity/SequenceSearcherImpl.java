package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

public class SequenceSearcherImpl implements SequenceSearcher {

	public SearchResult search(int key, int[] seq) {

		return new SearchResultImpl();
	}

}
