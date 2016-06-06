
  
public class HeartController implements ControllerInterface {
	static HeartModel model;
	DJView view;
	
	
	public HeartController(HeartModel model) {
		this.model = model;
		view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
		
	}
  
	public void start() {}
 
	public void stop() {}
	
    //metodo modificado
	public void increaseBPM() {
		HeartModel.getInstance();		
	}
    
	public void decreaseBPM() {}
  
 	public void setBPM(int bpm) {}
}



