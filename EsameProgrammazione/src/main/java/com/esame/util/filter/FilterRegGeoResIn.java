package com.esame.util.filter;

import com.esame.model.Record;
import com.esame.util.other.Filter;
import com.esame.util.other.FilterArrayStringParent;

/** Rappresenta la classe che implemeta il filtro per il campo RegGeoRes
 * con operatore: "corrisponde a"
 * @author Marco Sebastianelli
 * @author Cristian Vitali
*/

public class FilterRegGeoResIn extends FilterArrayStringParent implements Filter {

	
	public FilterRegGeoResIn(Object parametri) {
		super(parametri);
		
	}

	public boolean filter(Record record) {
		
		for(String param : param) {
			if(record.getRegGeoRes().equals(param)) {
				return true;
			}
		}
		return false;
	}
	
	
}
