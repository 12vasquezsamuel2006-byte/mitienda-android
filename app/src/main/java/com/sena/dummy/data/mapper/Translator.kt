package com.sena.dummy.data.mapper

// La API (dummyjson.com) entrega todo en inglés. Aquí traducimos lo que se muestra.
// Si un texto no está en el diccionario, se deja tal como llega de la API.
object Translator {

    private val categories = mapOf(
        "beauty" to "Belleza",
        "fragrances" to "Fragancias",
        "furniture" to "Muebles",
        "groceries" to "Alimentos",
        "home-decoration" to "Decoración del hogar",
        "kitchen-accessories" to "Accesorios de cocina",
        "laptops" to "Portátiles",
        "mens-shirts" to "Camisas de hombre",
        "mens-shoes" to "Zapatos de hombre",
        "mens-watches" to "Relojes de hombre",
        "mobile-accessories" to "Accesorios para celular",
        "motorcycle" to "Motocicletas",
        "skin-care" to "Cuidado de la piel",
        "smartphones" to "Celulares",
        "sports-accessories" to "Accesorios deportivos",
        "sunglasses" to "Gafas de sol",
        "tablets" to "Tablets",
        "tops" to "Blusas",
        "vehicle" to "Vehículos",
        "womens-bags" to "Bolsos de mujer",
        "womens-dresses" to "Vestidos de mujer",
        "womens-jewellery" to "Joyería de mujer",
        "womens-shoes" to "Zapatos de mujer",
        "womens-watches" to "Relojes de mujer"
    )

    private val titles = mapOf(
        "essence mascara lash princess" to "Máscara de Pestañas Essence Lash Princess",
        "eyeshadow palette with mirror" to "Paleta de Sombras con Espejo",
        "powder canister" to "Bote de Polvos",
        "red lipstick" to "Labial Rojo",
        "red nail polish" to "Esmalte de Uñas Rojo",
        "calvin klein ck one" to "Calvin Klein CK One",
        "chanel coco noir eau de" to "Chanel Coco Noir Eau de Parfum",
        "dior j'adore" to "Dior J'adore",
        "dolce shine eau de" to "Dolce Shine Eau de Parfum",
        "gucci bloom eau de" to "Gucci Bloom Eau de Parfum",
        "annibale colombo bed" to "Cama Annibale Colombo",
        "annibale colombo sofa" to "Sofá Annibale Colombo",
        "bedside table african cherry" to "Mesa de Noche Cerezo Africano",
        "knoll saarinen executive conference chair" to "Silla de Conferencia Ejecutiva Knoll Saarinen",
        "wooden bathroom sink with mirror" to "Lavabo de Madera con Espejo",
        "apple" to "Manzana",
        "beef steak" to "Bistec de Res",
        "cat food" to "Comida para Gatos",
        "chicken meat" to "Carne de Pollo",
        "cooking oil" to "Aceite de Cocina",
        "cucumber" to "Pepino",
        "dog food" to "Comida para Perros",
        "eggs" to "Huevos",
        "fish steak" to "Filete de Pescado",
        "green bell pepper" to "Pimiento Verde",
        "green chili pepper" to "Ají Verde",
        "honey jar" to "Frasco de Miel",
        "ice cream" to "Helado",
        "juice" to "Jugo",
        "kiwi" to "Kiwi"
    )

    private val descriptions = mapOf(
        "the essence mascara lash princess is a popular mascara known for its volumizing and lengthening effects. achieve dramatic lashes with this long-lasting and cruelty-free formula." to "La máscara Essence Lash Princess es una máscara muy popular por sus efectos de volumen y alargamiento. Logra pestañas dramáticas con esta fórmula de larga duración y libre de crueldad animal.",
        "the eyeshadow palette with mirror offers a versatile range of eyeshadow shades for creating stunning eye looks. with a built-in mirror, it's convenient for on-the-go makeup application." to "La paleta de sombras con espejo ofrece una amplia gama de tonos para crear looks de ojos espectaculares. Con su espejo integrado, es ideal para maquillarte en cualquier lugar.",
        "the powder canister is a finely milled setting powder designed to set makeup and control shine. with a lightweight and translucent formula, it provides a smooth and matte finish." to "El bote de polvos es un polvo fijador finamente molido que sella el maquillaje y controla el brillo. Con su fórmula ligera y translúcida, deja un acabado suave y mate.",
        "the red lipstick is a classic and bold choice for adding a pop of color to your lips. with a creamy and pigmented formula, it provides a vibrant and long-lasting finish." to "El labial rojo es una opción clásica y atrevida para darle un toque de color a tus labios. Su fórmula cremosa y pigmentada deja un acabado vibrante y duradero.",
        "the red nail polish offers a rich and glossy red hue for vibrant and polished nails. with a quick-drying formula, it provides a salon-quality finish at home." to "El esmalte rojo ofrece un tono intenso y brillante para unas uñas vibrantes y bien cuidadas. Con su fórmula de secado rápido, logra un acabado de salón en casa.",
        "ck one by calvin klein is a classic unisex fragrance, known for its fresh and clean scent. it's a versatile fragrance suitable for everyday wear." to "CK One de Calvin Klein es una fragancia unisex clásica, conocida por su aroma fresco y limpio. Es versátil y perfecta para el uso diario.",
        "coco noir by chanel is an elegant and mysterious fragrance, featuring notes of grapefruit, rose, and sandalwood. perfect for evening occasions." to "Coco Noir de Chanel es una fragancia elegante y misteriosa, con notas de toronja, rosa y sándalo. Perfecta para ocasiones nocturnas.",
        "j'adore by dior is a luxurious and floral fragrance, known for its blend of ylang-ylang, rose, and jasmine. it embodies femininity and sophistication." to "J'adore de Dior es una fragancia lujosa y floral, conocida por su mezcla de ylang-ylang, rosa y jazmín. Encarna la feminidad y la sofisticación.",
        "dolce shine by dolce & gabbana is a vibrant and fruity fragrance, featuring notes of mango, jasmine, and blonde woods. it's a joyful and youthful scent." to "Dolce Shine de Dolce & Gabbana es una fragancia vibrante y frutal, con notas de mango, jazmín y maderas claras. Es un aroma alegre y juvenil.",
        "gucci bloom by gucci is a floral and captivating fragrance, with notes of tuberose, jasmine, and rangoon creeper. it's a modern and romantic scent." to "Gucci Bloom de Gucci es una fragancia floral y cautivadora, con notas de nardo, jazmín y enredadera de Rangún. Es un aroma moderno y romántico.",
        "the annibale colombo bed is a luxurious and elegant bed frame, crafted with high-quality materials for a comfortable and stylish bedroom." to "La cama Annibale Colombo es una estructura lujosa y elegante, fabricada con materiales de alta calidad para un dormitorio cómodo y con estilo.",
        "the annibale colombo sofa is a sophisticated and comfortable seating option, featuring exquisite design and premium upholstery for your living room." to "El sofá Annibale Colombo es una opción sofisticada y cómoda, con un diseño exquisito y tapizado de primera calidad para tu sala.",
        "the bedside table in african cherry is a stylish and functional addition to your bedroom, providing convenient storage space and a touch of elegance." to "La mesa de noche en cerezo africano es un complemento elegante y funcional para tu dormitorio, con espacio de almacenamiento práctico y un toque de distinción.",
        "the knoll saarinen executive conference chair is a modern and ergonomic chair, perfect for your office or conference room with its timeless design." to "La silla de conferencia ejecutiva Knoll Saarinen es moderna y ergonómica, ideal para tu oficina o sala de reuniones gracias a su diseño atemporal.",
        "the wooden bathroom sink with mirror is a unique and stylish addition to your bathroom, featuring a wooden sink countertop and a matching mirror." to "El lavabo de madera con espejo es un complemento único y con estilo para tu baño, con encimera de madera y un espejo a juego.",
        "fresh and crisp apples, perfect for snacking or incorporating into various recipes." to "Manzanas frescas y crujientes, perfectas para un snack o para usar en distintas recetas.",
        "high-quality beef steak, great for grilling or cooking to your preferred level of doneness." to "Bistec de res de alta calidad, ideal para asar o cocinar al término que prefieras.",
        "nutritious cat food formulated to meet the dietary needs of your feline friend." to "Comida nutritiva para gatos, formulada para cubrir las necesidades alimenticias de tu felino.",
        "fresh and tender chicken meat, suitable for various culinary preparations." to "Carne de pollo fresca y tierna, apta para diversas preparaciones culinarias.",
        "versatile cooking oil suitable for frying, sautéing, and various culinary applications." to "Aceite de cocina versátil, apto para freír, saltear y muchas otras preparaciones.",
        "crisp and hydrating cucumbers, ideal for salads, snacks, or as a refreshing side." to "Pepinos crujientes e hidratantes, ideales para ensaladas, snacks o como acompañante refrescante.",
        "specially formulated dog food designed to provide essential nutrients for your canine companion." to "Comida para perros especialmente formulada para aportar los nutrientes esenciales que necesita tu compañero canino.",
        "fresh eggs, a versatile ingredient for baking, cooking, or breakfast." to "Huevos frescos, un ingrediente versátil para hornear, cocinar o el desayuno.",
        "quality fish steak, suitable for grilling, baking, or pan-searing." to "Filete de pescado de calidad, apto para asar, hornear o sellar en sartén.",
        "fresh and vibrant green bell pepper, perfect for adding color and flavor to your dishes." to "Pimiento verde fresco y vibrante, perfecto para darle color y sabor a tus platos.",
        "spicy green chili pepper, ideal for adding heat to your favorite recipes." to "Ají verde picante, ideal para darle un toque de picante a tus recetas favoritas.",
        "pure and natural honey in a convenient jar, perfect for sweetening beverages or drizzling over food." to "Miel pura y natural en un frasco práctico, perfecta para endulzar bebidas o para acompañar tus comidas.",
        "creamy and delicious ice cream, available in various flavors for a delightful treat." to "Helado cremoso y delicioso, disponible en varios sabores para un antojo delicioso.",
        "refreshing fruit juice, packed with vitamins and great for staying hydrated." to "Jugo de fruta refrescante, lleno de vitaminas y excelente para mantenerte hidratado.",
        "nutrient-rich kiwi, perfect for snacking or adding a tropical twist to your dishes." to "Kiwi rico en nutrientes, perfecto para un snack o para darle un toque tropical a tus platos."
    )

    fun category(value: String): String =
        categories[value.trim().lowercase()] ?: value

    fun title(value: String): String =
        titles[value.trim().lowercase()] ?: value

    fun description(value: String): String =
        descriptions[value.trim().lowercase()] ?: value
}
