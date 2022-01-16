package com.example.murdermystery;

public class Interaction {
    public Interaction( String interactionText, String imagePath) {
        this.checked = false;
        this.interactionText = interactionText;
        this.imagePath = imagePath;
    }

    public Interaction(String interactionText) {
        this.checked = false;
        this.imagePath = "";
        this.interactionText = interactionText;
    }

    private boolean checked;
    private String interactionText;
    private String imagePath;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getInteractionText() {
        return interactionText;
    }

    public void setInteractionText(String interactionText) {
        this.interactionText = interactionText;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
