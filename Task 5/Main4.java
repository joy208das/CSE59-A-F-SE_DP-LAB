

 interface OptimizableModel {
void quantize();
    
}
class ResNet18 implements OptimizableModel {

    @Override
    public void quantize() {
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}


class MobileNet implements OptimizableModel {

    @Override
    public void quantize() {
        System.out.println("Applying dynamic quantization for MobileNet.");
    }
}

class InferenceEngine {

    public void optimize(OptimizableModel model) {
        model.quantize();
    }
}

public class Main {
    public static void main(String[] args){

        InferenceEngine engine = new InferenceEngine();

        OptimizableModel resent = new ResNet18();
        OptimizableModel mobile = new MobileNet();

        engine.optimize(resent);
        engine.optimize(mobile);
    }
}
