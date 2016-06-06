

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
	
	//agrego metodo a la interfaz para poder llamarlo en el HeartController
	HeartModel getInstance();
	int getCantInstance();
}
