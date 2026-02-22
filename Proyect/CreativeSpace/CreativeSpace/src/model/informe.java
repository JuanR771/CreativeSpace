package model;

import java.util.ArrayList;
import java.util.List;

public class informe {

	private String tipoinforme;
        
        List <compra> compras = new ArrayList<>();

    public informe(String tipoinforme, List<compra>compras) {
        this.tipoinforme = tipoinforme;
        this.compras = compras;
    }
        
        
	
}
