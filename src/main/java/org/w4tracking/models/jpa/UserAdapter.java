package org.w4tracking.models.jpa;

import org.w4tracking.models.ModelType;
import org.w4tracking.models.UserModel;
import org.w4tracking.models.jpa.entities.CompanyEntity;
import org.w4tracking.models.jpa.entities.UserEntity;

import javax.persistence.EntityManager;

public class UserAdapter implements UserModel {

    private final EntityManager em;
    private final UserEntity user;

    public UserAdapter(EntityManager em, UserEntity user) {
        this.em = em;
        this.user = user;
    }

    @Override
    public String getId() {
        return user.getId();
    }

    @Override
    public ModelType getType() {
        return ModelType.COMPANY;
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public String getIdentityId() {
        return user.getIdentityId();
    }

    @Override
    public String getIdentityProvider() {
        return user.getIdentityProvider();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public void setEmail(String email) {
        user.getEmail();
    }

    @Override
    public String getFullName() {
        return user.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        user.setFullName(fullName);
    }
}
