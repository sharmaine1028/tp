package seedu.address.ui;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import seedu.address.commons.core.LogsCenter;

    /**
     * Panel containing the list of persons.
     */
    public class PieChartPanel extends UiPart<Region> {
        private static final String FXML = "PieChartPanel.fxml";
        private final Logger logger = LogsCenter.getLogger(seedu.address.ui.PieChartPanel.class);

        @FXML
        private Label pieChartTitle;

        /**
         * TODO: Edit image to pie chart
         * Creates a {@code PieChartPanel} with a default image
         */
        public PieChartPanel() {
            super(FXML);
            pieChartTitle.setText("PennyWise");
        }

    }
