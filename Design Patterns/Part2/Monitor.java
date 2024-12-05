public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       return computerPartVisitor.visit(this);
    }
}