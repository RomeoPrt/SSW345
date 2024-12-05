public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       return computerPartVisitor.visit(this);
    }
}
    