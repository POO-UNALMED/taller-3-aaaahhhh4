package taller3.televisores;

public class TV {
	public Marca marca;
	public int canal = 1;
	public int precio = 500;
	public boolean estado;
	public int volumen = 1;
	public Control control;
	public static int numTV;
	public TV(Marca m, boolean e){
		marca = m; estado= e;
	}
	public void setMarca(Marca m) {
		marca = m;
	}
	public void setControl(Control c) {
		control = c;
	}
	public void setPrecio(int p) {
		precio = p;
	}
	public void setVolumen(int v) {
		volumen = v;
	}
	public void setCanal(int ch) {
		if(estado == true) {
			if(ch>=1 && ch<=120) {
				canal = ch;
			}
		}
	}
	public static void setNumTV(int n) {
		numTV= n;
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOff() {
		estado = false;
	}
	public void turnOn() {
		estado = true;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (this.estado == true) {
			if (this.canal < 120 &&  this.canal >= 1) {
				this.canal++;
			}
		}
	}
	public void canalDown() {
		if (this.estado == true) {
			if (this.canal <= 120 &&  this.canal > 1) {
				this.canal--;
			}
		}
	}	
	public void volumenUp() {
		if (this.estado == true) {
			if (this.volumen < 7 &&  this.volumen >= 0) {
				this.volumen++;
			}
		}
	}
	public void volumenDown() {
		if (this.estado == true) {
			if (this.volumen <= 7 &&  this.volumen > 0) {
				this.volumen--;
			}
		}
	}
}
