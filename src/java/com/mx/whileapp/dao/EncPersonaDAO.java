package com.mx.whileapp.dao;

import java.util.Collection;

public interface EncPersonaDAO {
    public int insert(EncPersonaDTO persona);
    public int isert (EncPersonaDTO persona, EncProductoDTO producto);
    public Collection<EncPersonaDTO> getPersonas();
}
