package taller3.televisores;

public class Control {
	public TV tv;
	public void setTv(TV t) {
		tv = t;
	}
	public TV getTv() {
		return tv;
	}
	public void enlazar(TV t) {
		this.tv = t;
		t.setControl(this);
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int c) {
		tv.setCanal(c);
	}
}
