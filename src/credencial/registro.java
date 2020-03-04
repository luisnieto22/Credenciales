package credencial;

import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class registro {
	private ObjectContainer db =null;
	
	private void abrirregistro() {
		db=Db4oEmbedded.openFile("Registro de usuario");
	}
	
	private void cerraregistro() {
		
		db.close();
	}
	
	public void insertarregistro(datos dat) {
		
		abrirregistro();
		db.store(dat);
		cerraregistro();
	}
	
	public datos seleccionarpersona(datos dat) {
		abrirregistro();
		ObjectSet resultado=db.queryByExample(dat);
		datos usuario = (datos) resultado.next();
		cerraregistro();
		return usuario;
	}
	public List<datos> seleccionarlista(){
		abrirregistro();
		ObjectSet listadatos=db.queryByExample(datos.class);
		List<datos> Up = new ArrayList<>();
		 
		for(Object listadatos1:listadatos) {
			Up.add((datos)listadatos1);
		}
		cerraregistro();
		return Up;
	}
}
