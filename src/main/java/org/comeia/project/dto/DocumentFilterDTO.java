package org.comeia.project.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.comeia.project.search.SearchCriteria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
public @Data class DocumentFilterDTO implements Serializable {

	private String name;
	
	public static List<SearchCriteria> buildCriteria(DocumentFilterDTO filter) {
		List<SearchCriteria> criterias = new ArrayList<>();
		
		if(filter.getName() != null && !filter.getName().isEmpty()) { 
			criterias.add(new SearchCriteria("name", "%".concat(filter.getName()).concat("%")));
		}
		
		
		return criterias;
	}
}