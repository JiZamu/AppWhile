package com.mx.whileapp.dao;

import java.util.Collection;

public interface EncPersonaDAO {
    public void insert(EncPersonaDTO persona);
    public void isert (EncPersonaDTO persona, EncProductoDTO producto);
    public Collection<EncPersonaDTO> getPersonas();
}
