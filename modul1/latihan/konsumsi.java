public class konsumsi<M, I>{
    private M m;
    private I i;

    public M testM(){
        return m;
    }

    public I testI(){
        return i;
    }

    public void setKonsum(M makan, I minum){
        this.m = makan;
        this.i = minum;
    }
}
