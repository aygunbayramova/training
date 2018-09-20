package com.farukecza.eczacrm.service;

import java.util.List;
import java.util.Optional;

public interface ServiceBase<T>
{
    Iterable<T> getAll();
    Optional<T> findById(int id);
}