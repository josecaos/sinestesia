o = Overlay
o.start;
o.dibuja;


(
w = UserView.new.front;
//change the gaps and margins to see how they work
w.view.decorator = FlowLayout( w.view.bounds, 150@50, 40@50 );
16.do{ Slider2D( w.view,80@80 ).background_( Color.rand ) };
)