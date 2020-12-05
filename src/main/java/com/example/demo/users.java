package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Entity
public class users implements User{
	
	@Id
	private String uname;
	private String pno;
	private String psw;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	@Override
	public String toString() {
		return "users [uname=" + uname + ", pno=" + pno + ", psw=" + psw + "]";
	}
	@Override
	public List<users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<users> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<users> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends users> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends users> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteInBatch(Iterable<users> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public users getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends users> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends users> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<users> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends users> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<users> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(users entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends users> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends users> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends users> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends users> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends users> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
