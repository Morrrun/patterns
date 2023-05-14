package pattern_decorator;

import pattern_decorator.decorator.BasicWashingProgram;
import pattern_decorator.decorator.BoilingWashingProgram;
import pattern_decorator.decorator.DoubleSpinningProgram;

public class WashingMachine {

    public static void main(String[] args) {
        BasicWashingProgram program = new BasicWashingProgram();
        DoubleSpinningProgram spinningProgram =
                new DoubleSpinningProgram(program);
        BoilingWashingProgram boilingProgram =
                new BoilingWashingProgram(spinningProgram);
        boilingProgram.executeProgram();
    }
}
