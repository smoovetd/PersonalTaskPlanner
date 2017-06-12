package personaltaskplanner.io.output;

public class ConsoleWriterImpl implements Writer{

    @Override
    public void writeLine(String lineContent) {
        if (lineContent == null || lineContent.equals("")){
            throw new 
        }
        System.out.println(lineContent);
    }

    @Override
    public void write(String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
