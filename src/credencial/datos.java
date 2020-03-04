package credencial;

public class datos {
		private String nombre;
		private String apellidoP;
		private String apellidoM;
		private String domicilio;
		private String clavedelector;
		private String curp;
		private String sexo;
		private String fechanacimiento;
		private int añoderegistro;
		private int codigopostal;
		private String Municipio;
		private int vigencia;
		private int id;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidoP() {
			return apellidoP;
		}
		public void setApellidoP(String apellidoP) {
			this.apellidoP = apellidoP;
		}
		public String getApellidoM() {
			return apellidoM;
		}
		public void setApellidoM(String apellidoM) {
			this.apellidoM = apellidoM;
		}
		public String getDomicilio() {
			return domicilio;
		}
		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}
		public String getClavedelector() {
			return clavedelector;
		}
		public void setClavedelector(String clavedelector) {
			this.clavedelector = clavedelector;
		}
		public String getCurp() {
			return curp;
		}
		public void setCurp(String curp) {
			this.curp = curp;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getFechanacimiento() {
			return fechanacimiento;
		}
		public void setFechanacimiento(String fechanacimiento) {
			this.fechanacimiento = fechanacimiento;
		}
		public int getAñoderegistro() {
			return añoderegistro;
		}
		public void setAñoderegistro(int añoderegistro) {
			this.añoderegistro = añoderegistro;
		}
		public int getCodigopostal() {
			return codigopostal;
		}
		public void setCodigopostal(int codigopostal) {
			this.codigopostal = codigopostal;
		}
		public String getMunicipio() {
			return Municipio;
		}
		public void setMunicipio(String municipio) {
			Municipio = municipio;
		}
		public int getVigencia() {
			return vigencia;
		}
		public void setVigencia(int vigencia) {
			this.vigencia = vigencia;
		}
		public String toString() {
			return "Nombre: " + nombre  +"\nApellidos: "+ apellidoP+" "+apellidoM+"\nDomicilio: " + domicilio+"\nClave de elector: "+clavedelector+"\nCURP: "
					+curp+"\nGenero: "+sexo+"\nFecha de nacimiento: "+fechanacimiento+"\nAño de Registro: "+añoderegistro+"\nCiudad: "+Municipio+"\nVigencia: "+vigencia;
		}
}
