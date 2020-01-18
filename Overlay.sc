Overlay {

	classvar w, ventana,linea;

	*new {
		^super.new;
	}

	*start {
		ventana = Window.availableBounds;
		linea = Color.black;
		w = Window.new("Overlay",ventana,true,false).front;
		w.view.background_(Color.clear);
		w.alwaysOnTop = true;

		^ventana;
	}

	*dibuja {
		ventana.right.postcln;
		^w.drawFunc = {
			Pen.strokeColor = linea;
			35.do { // draw 35 lines
				Pen.moveTo(0@0);
				Pen.lineTo(50@350);
				Pen.translate(10, 0); // shift 10 to the right every time
				Pen.stroke
			}

		}

	}
}