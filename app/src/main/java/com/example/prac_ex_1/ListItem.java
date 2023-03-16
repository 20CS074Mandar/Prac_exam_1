package com.example.prac_ex_1;

public class ListItem {
    private String title;
    private String subtitle;
    private boolean isSelected;

    public ListItem(String title, String subtitle, boolean isSelected) {
        this.title = title;
        this.subtitle = subtitle;
        this.isSelected = isSelected;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
