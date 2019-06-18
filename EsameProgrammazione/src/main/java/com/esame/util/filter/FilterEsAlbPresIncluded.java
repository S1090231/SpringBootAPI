package com.esame.util.filter;

import com.esame.model.Record;
import com.esame.util.other.Filter;
import com.esame.util.other.Filter2ParParent;

/** Rappresenta la classe che implemeta il filtro per il campo EsAlPres
 * con operatore: "incluso tra" 
 * @author Marco Sebastianelli
 * @author Cristian Vitali
*/

public class FilterEsAlbPresIncluded extends Filter2ParParent implements Filter  {
	
		
	public FilterEsAlbPresIncluded(Object parametri) {
		super(parametri);
	}

	public boolean filter(Record record) {
		
		if( record.getEsAlbPres() >= parametro1 & record.getEsAlbPres() <= parametro2) {
			return true;
		}
		return false;
	}
}
	