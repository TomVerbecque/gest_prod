package l3miage.gest_prod;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import java.util.Map;

public class ChaineProduction {
    private SimpleStringProperty code;
    private SimpleStringProperty name;
    private SimpleStringProperty activationLevel;
    private SimpleStringProperty inputElements;
    private SimpleStringProperty outputElements;

    // Constructeur
    public ChaineProduction(String code, String name,String activationLevel, Map<Element, Integer> entrees, Map<Element, Integer> sorties) {
        this.code = new SimpleStringProperty(code);
        this.name = new SimpleStringProperty(name);
        this.activationLevel = new SimpleStringProperty(activationLevel);
        this.inputElements = new SimpleStringProperty(GestionCSV.formatElements(entrees));
        this.outputElements = new SimpleStringProperty(GestionCSV.formatElements(sorties));
    }

    // Getters pour JavaFX TableView
    public String getCode() {
        return code.get();
    }

    public String getName() {
        return name.get();
    }

    // Pour obtenir les noms et quantités formatés des entrées
   

    // Méthode utilitaire pour formater les éléments de la Map
    

    // Setters au cas où vous en auriez besoin pour la logique de l'application
    public void setCode(String code) {
        this.code.set(code);
    }

    public void setName(String name) {
        this.name.set(name);
    }

	public String getActivationLevel() {
		return activationLevel.get();
	}

	public void setActivationLevel(String activationLevel) {
		this.activationLevel.set(activationLevel);
	}

	public String getInputElements() {
		return inputElements.get();
	}

	public void setInputElements(String inputElements) {
		this.inputElements.set(inputElements);
	}

	public String getOutputElements() {
		return outputElements.get();
	}

	public void setOutputElements(String outputElements) {
		this.outputElements.set(outputElements);
	}

  
}
