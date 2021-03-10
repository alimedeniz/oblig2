const bekreftBillett = (e) => {
  e.preventDefault();
  const kunde = {
    film: $("#filmList").val(),
    antall: $("#antall").val(),
    fornavn: $("#fornavn").val(),
    etternavn: $("#etternavn").val(),
    tlf: $("#tlf").val(),
    epost: $("#epost").val(),
  };
  $.post("/lagre", kunde, function () {
    hentAlle();
  });
};
const hentAlle = () => {
  $.get("/billetter", function (data) {
    formaterData(data);
  });

  $("#filmList").val("");
  $("#antall").val("");
  $("#fornavn").val("");
  $("#etternavn").val("");
  $("#tlf").val("");
  $("#epost").val("");
};

const formaterData = (kunder) => {
  for (const kunde of kunder) {
    melding.innerHTML += /*html*/ `
      <div> 
        Film:${kunde.film} </br>
        Antall:${kunde.antall}</br>
        Fornavn:${kunde.fornavn}</br>
        Etternavn:${kunde.etternavn}</br>
        Telefonnummer:${kunde.tlf}</br>
        Epost:${kunde.epost}</br>
      </div>
      `;
  }
};

const slettBilett = () => {
  form.reset();
  melding.innerHTML = "";
  $.get("/slett", function () {
    hentAlle;
  });
};

let melding = document.getElementById("melding");

const form = document.querySelector("form");
form.addEventListener("submit", bekreftBillett);
form.addEventListener("reset", slettBilett);
