package kajo.ohjelma.control.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import kajo.ohjelma.control.domain.AaltoLpk;
import kajo.ohjelma.control.domain.Ikakausi;
import kajo.ohjelma.control.domain.Kategoria;
import kajo.ohjelma.control.domain.Ohjelma;
import kajo.ohjelma.control.domain.repos.AlaleiriRepo;
import kajo.ohjelma.control.domain.repos.IkakausiRepo;
import kajo.ohjelma.control.domain.repos.KategoriaRepo;
import kajo.ohjelma.control.domain.repos.LeirilpkRepo;
import kajo.ohjelma.control.domain.repos.LippuAaltoRepo;
import kajo.ohjelma.control.domain.repos.OhjelmaRepo;
import kajo.ohjelma.control.domain.repos.OsaalueRepo;
import kajo.ohjelma.control.domain.repos.RyhmaRepo;

@Controller
public class MainController {
	
	
	@Autowired
	private OhjelmaRepo ohjelmaRepo;
	
	@Autowired
	private LippuAaltoRepo aaltoRepo; 

	@Autowired
	private KategoriaRepo katRepo; 
	
	@Autowired
	private AlaleiriRepo alaRepo; 
	
	@Autowired
	private IkakausiRepo ikaRepo; 
	
	@Autowired
	private OsaalueRepo osalRepo; 
	
	@Autowired
	private RyhmaRepo ryhmaRepo; 
	
	@Autowired
	private LeirilpkRepo lpkRepo;
	
	
	@GetMapping("/")
	public String getStart() {
		return "first"; 
	}
	
	@GetMapping("/index")
	public String getOhjelma(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAll());
		return "index";
		
	}
	
	@GetMapping("/eka")
	public String getFirstDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-15"));
		return "day";
	}
	
	@GetMapping("/toka")
	public String getSecDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-16"));
		return "day";
	}
	@GetMapping("/kolmas")
	public String getThirdDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-17"));
		return "day";
	}
	
	@GetMapping("/neljas")
	public String getFourDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-18"));
		return "day";
	}
	
	@GetMapping("/viides")
	public String getFiveDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-19"));
		return "day";
	}
	
	@GetMapping("/kuudes")
	public String getSixDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-20"));
		return "day";
	}
	
	@GetMapping("/seiska")
	public String getSevDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-21"));
		return "day";
	}
	@GetMapping("/kasi")
	public String getEightDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-22"));
		return "day";
	}
	
	@GetMapping("/ysi")
	public String getNineDay(Model model) {
		model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByDate("2022-07-23"));
		return "day";
	}
	
	@GetMapping("/muuttujat")
	public String getVariables(Model model) {
		model.addAttribute("alaleirit", alaRepo.findAll());
		model.addAttribute("kategoriat", katRepo.findAll());
		model.addAttribute("ikakaudet", ikaRepo.findAll());
		model.addAttribute("osalueet", osalRepo.findAll());
		model.addAttribute("ryhmat", ryhmaRepo.findAll());
		model.addAttribute("lpkt", lpkRepo.findAll());
		return "variables";
	}
	
	@GetMapping("/aalto")
	public String getWaves(Model model) {
		model.addAttribute("aaltolista", aaltoRepo.findAll());
		return "aalto";
	}
	
	@GetMapping("/aukiolo")
	public String getOpTimes(Model model) {
		Optional<Kategoria> etsi = katRepo.findById("Aukiolo");
		if (etsi.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByKategoria(etsi.get()));
		}
		return "opening";
	}
	
	@GetMapping("/ruoka")
	public String getFoodTimes(Model model) {
		Optional<Kategoria> etsi = katRepo.findById("Ruokailu");
		if (etsi.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByKategoria(etsi.get()));
		}
		return "opening";
	}
	
	@GetMapping("/kokous")
	public String getMeetingTimes(Model model) {
		Optional<Kategoria> etsi = katRepo.findById("Kokous");
		if (etsi.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByKategoria(etsi.get()));
		}
		return "opening";
	}
	
	@GetMapping("/tapaamiset")
	public String getMeetupTimes(Model model) {
		Optional<Kategoria> etsi = katRepo.findById("Tapaaminen");
		if (etsi.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByKategoria(etsi.get()));
		}
		return "opening";
	}
	
	@GetMapping("/valinnaiset")
	public String getSelectiveTimes(Model model) {
		Optional<Kategoria> etsi = katRepo.findById("Valinnainen ohjelma");
		if (etsi.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByKategoria(etsi.get()));
		}
		return "opening";
	}
	
	@GetMapping("/editoi/{id}")
	public String editOhjelma(@PathVariable("id") Integer ohjelmaId, Model model) {
		model.addAttribute("ohjelma", ohjelmaRepo.findById(ohjelmaId).get());
		model.addAttribute("alaleirit", alaRepo.findAll()); 
		model.addAttribute("ikakausi", ikaRepo.findAll());
		model.addAttribute("kategoriat", katRepo.findAll());
		model.addAttribute("osalue", osalRepo.findAll());
		model.addAttribute("ryhma", ryhmaRepo.findAll());
		return "editoi";	
	}
	
	@GetMapping("/uusiohjelma")
	public String createOhjelma(Model model) {
		model.addAttribute("ohjelma", new Ohjelma());
		model.addAttribute("alaleirit", alaRepo.findAll()); 
		model.addAttribute("ikakausi", ikaRepo.findAll());
		model.addAttribute("kategoriat", katRepo.findAll());
		model.addAttribute("osalue", osalRepo.findAll());
		model.addAttribute("ryhma", ryhmaRepo.findAll());
		return "create";
	}
	
	@PostMapping("/tallenna")
	public String saveOhjelma(Model model, @ModelAttribute("ohjelma") Ohjelma ohjelma) {
		ohjelmaRepo.save(ohjelma); 
		return "redirect:/index";
	}
	
	@PostMapping("/savewave")
	public String saveAalto(Model model, @ModelAttribute("aalto") AaltoLpk aalto) {
		aaltoRepo.save(aalto);
		return "redirect:/aalto";
	}
	
	@GetMapping("/aaltodel/{id}")
	public String removeWave(@PathVariable("id") Long tunniste) {
		
		aaltoRepo.deleteById(tunniste); 
		return "redirect:/aalto";
	}
	
	@GetMapping("/aaltoedit/{id}")
	public String editWave(@PathVariable("id") Long tunniste, Model model) {
		model.addAttribute("aalto", aaltoRepo.findById(tunniste).get());
		model.addAttribute("alaleirit", alaRepo.findAll()); 
		model.addAttribute("lpkt", lpkRepo.findAll());
		return "wave";
	}
	
	@GetMapping("/poista/{id}")
	public String deletor(@PathVariable("id") Integer id) {
		ohjelmaRepo.deleteById(id);
		return "redirect:/index";
	}
	
	@GetMapping("/tarpoja")
	public String getTarpoja(Model model) {
		Optional<Ikakausi> tarp = ikaRepo.findById("Tarpoja");
		if(tarp.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByIkakausi(tarp.get()));
		}
		return "group";
	}
	
	@GetMapping("/samoaja")
	public String getSamoaja(Model model) {
		Optional<Ikakausi> tarp = ikaRepo.findById("Samoaja");
		if(tarp.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByIkakausi(tarp.get()));
		}
		return "group";
	}
	
	@GetMapping("/vaeltaja")
	public String getVaeltaja(Model model) {
		Optional<Ikakausi> tarp = ikaRepo.findById("Vaeltaja");
		if(tarp.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByIkakausi(tarp.get()));
		}
		return "group";
	}
	
	@GetMapping("/aikuinen")
	public String getAikuinen(Model model) {
		Optional<Ikakausi> tarp = ikaRepo.findById("Aikuinen");
		if(tarp.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByIkakausi(tarp.get()));
		}
		return "group";
	}
	
	@GetMapping("/kaikki")
	public String getKaikki(Model model) {
		Optional<Ikakausi> tarp = ikaRepo.findById("Kaikki");
		if(tarp.isPresent()) {
			model.addAttribute("ohjelmalista", ohjelmaRepo.findAllByIkakausi(tarp.get()));
		}
		return "group";
	}
	
	
	
	
	
	
	

}
