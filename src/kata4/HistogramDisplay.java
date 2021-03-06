package kata4;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame{
    public Histogram<String> histogram;
    
    public HistogramDisplay( Histogram<String> histogram){
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
        
    }
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        
        chartPanel.setPreferredSize (new Dimension(500,400));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart;
        chart = ChartFactory.createBarChart(
     "JFreeChart HISTOGRAM", 
     "Dominio Email", 
     "Num de Emails", 
     dataSet, 
     PlotOrientation.VERTICAL, 
     false, 
     rootPaneCheckingEnabled, 
     rootPaneCheckingEnabled
     );
       
        return chart;
        
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet= new DefaultCategoryDataset();
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }

        return dataSet;

                
    }
}