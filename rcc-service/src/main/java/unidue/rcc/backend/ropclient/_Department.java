package unidue.rcc.backend.ropclient;

import org.apache.cayenne.PersistentObject;

/**
 * A generated persistent class mapped as "Department" Cayenne entity. It is a good idea to
 * avoid changing this class manually, since it will be overwritten next time code is
 * regenerated. If you need to make any customizations, put them in a subclass.
 */
public abstract class _Department extends PersistentObject {

    public static final String CATEGORY_ID_PROPERTY = "categoryId";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String LANG_PROPERTY = "lang";
    public static final String PARENT_ID_PROPERTY = "parentId";
    public static final String TEXT_PROPERTY = "text";

    protected String categoryId;
    protected String description;
    protected String lang;
    protected Integer parentId;
    protected String text;

    public String getCategoryId() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "categoryId", false);
        }

        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "categoryId", false);
        }

        Object oldValue = this.categoryId;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "categoryId", oldValue, categoryId);
        }
        
        this.categoryId = categoryId;
    }

    public String getDescription() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "description", false);
        }

        return description;
    }
    public void setDescription(String description) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "description", false);
        }

        Object oldValue = this.description;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "description", oldValue, description);
        }
        
        this.description = description;
    }

    public String getLang() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "lang", false);
        }

        return lang;
    }
    public void setLang(String lang) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "lang", false);
        }

        Object oldValue = this.lang;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "lang", oldValue, lang);
        }
        
        this.lang = lang;
    }

    public Integer getParentId() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "parentId", false);
        }

        return parentId;
    }
    public void setParentId(Integer parentId) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "parentId", false);
        }

        Object oldValue = this.parentId;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "parentId", oldValue, parentId);
        }
        
        this.parentId = parentId;
    }

    public String getText() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "text", false);
        }

        return text;
    }
    public void setText(String text) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "text", false);
        }

        Object oldValue = this.text;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "text", oldValue, text);
        }
        
        this.text = text;
    }

}
